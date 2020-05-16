package com.example.tddtutorial.authentication.impl;

import com.example.tddtutorial.authentication.interf.IReportGenerator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Calendar;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ReportGeneratorServiceTest {

    @Mock
    IReportGenerator iReportGenerator;

    @InjectMocks
    ReportGeneratorService reportGeneratorService;
    @Captor
    private ArgumentCaptor<ReportEntity> reportCaptor;

    @Test
    public  void test(){

        Calendar startDate = Calendar.getInstance();
        startDate.set(2016, 11, 25);
        Calendar endDate = Calendar.getInstance();
        endDate.set(9999, 12, 31);
        String reportContent = "Report Content";

        reportGeneratorService.generateReport(startDate.getTime(), endDate.getTime(), reportContent.getBytes());


        Mockito.verify(iReportGenerator).generateReport(reportCaptor.capture());


        ReportEntity report = reportCaptor.getValue();
        assertEquals(116, report.getStartDate().getYear());
        assertEquals(11, report.getStartDate().getMonth());
        assertEquals(25, report.getStartDate().getDate());
        assertEquals(8100, report.getEndDate().getYear());
        assertEquals(0, report.getEndDate().getMonth());
        assertEquals(31, report.getEndDate().getDate());
        assertEquals("Report Content", new String(report.getContent()));
    }

}