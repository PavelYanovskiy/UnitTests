package HomeTask_4.Task_2.test.book;
/**
 * У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных.
 * Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.
 */

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import HomeTask_4.Task_2.main.book.Book;
import HomeTask_4.Task_2.main.book.BookService;
import hotel.BookingService;

class BookServiceTest {
    @Test
    void testBookRepo() {
        BookRepository bookRepository = mock(BookRepository.class);
        when(bookRepository.findById(toString())).thenReturn((Book) Arrays.asList("1", "BookTest", "AutorTest"));
        when(bookRepository.findAll()).thenReturn(new ArrayList<>(List.of()));
        BookingService bookService = new BookService(bookRepository);
        assertThat(bookService.findBookById("1")).isEqualTo("1");

    }

    private HomeTask_4.Task_2.test.book.BookRepository mock(Class<HomeTask_4.Task_2.test.book.BookRepository> class1) {
        return null;
    }
}
