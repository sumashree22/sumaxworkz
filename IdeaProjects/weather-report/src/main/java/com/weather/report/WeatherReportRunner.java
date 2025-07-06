package com.weather.report;


import com.weather.report.dto.WeatherReportDto;
import com.weather.report.service.WeatherReportService;
import com.weather.report.service.impl.WeatherReportServiceImpl;

public class WeatherReportRunner {

    static WeatherReportService weatherReportService;

    public static void main(String[] args) {
        WeatherReportDto reportDto = new WeatherReportDto();
        reportDto.setLocation("New York");
        reportDto.setDate("2025-06-18");
        reportDto.setWeatherCondition("Sunny");
        reportDto.setTemperatureCelsius(27.5);
        reportDto.setWindSpeedKph(14.2);

        weatherReportService = new WeatherReportServiceImpl();
        weatherReportService.validateAndSaveReport(reportDto);
        System.out.println("Weather Report Saved...");

        weatherReportService.updateTemperatureByReportId(1, 29.0);
        System.out.println("Temperature Updated...");

        weatherReportService.deleteReportById(1);
        System.out.println("Weather Report Deleted...");
    }
}