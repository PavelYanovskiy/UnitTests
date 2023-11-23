package HomeTask_4.Task_2.test.weather;

import static org.assertj.core.api.Assertions.*;
import static  org.mockito.Mockito.*;

import HomeTask_4.Task_2.main.weather.WeatherReporter;
import HomeTask_4.Task_2.main.weather.WeatherService;

class WeatherReporterTest {
    @HomeTask_4.Task_2.test.book.Test
    void testReporter(){
        WeatherService weatherService = mock(WeatherService.class);
        when(weatherService.getCurrentTemperature()).thenReturn(23);

        WeatherReporter weatherReporter = new WeatherReporter(weatherService);
        assertThat(weatherReporter.generateReport()).isEqualTo("Текущая температура: 23 градусов.");
    }

    private Object when(Object currentTemperature) {
        return null;
    }

    private HomeTask_4.Task_2.test.weather.WeatherService mock(
            Class<HomeTask_4.Task_2.test.weather.WeatherService> class1) {
        return null;
    }


}
