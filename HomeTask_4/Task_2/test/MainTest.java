import static org.mockito.Mockito.*;

import java.util.Iterator;
import java.util.List;


class MainTest {

    /**
     * 4.0. Проверка работы Mockito
     */
    @Test
    public void simpleTest() {
        // Создаем мок
        List<String> mockedList = mock(List.class);

        // Используем мок
        mockedList.add("one");
        mockedList.clear();

        // Проверяем, что методы были вызваны
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    private List<String> mock(Class<List> class1) {
        return null;
    }

    private List<String> verify(List<String> mockedList) {
        return null;
    }

    /**
     * 4.1. Создать мок-объект Iterator, настроить поведение так,
     * чтобы за два вызова next() Iterator вернул два слова  “Hello World”,
     * и проверить это поведение с помощью утверждений
     */
    @Test
    public void iteratorWillReturnHelloWorld() {
        // Arrange
        Iterator iteratorMock = mock(Iterator.class);
        when(iteratorMock.next()).thenReturn("Hello")
                .thenReturn("World!");

        // Act
        String result = iteratorMock.next() + " " + iteratorMock.next();
        assertThat(result).isEqualTo("Hello World!");
    }

    private Iterator mock(Class<Iterator> class1) {
        return null;
    }

    private Object assertThat(String result) {
        return null;
    }

    private Object assertThat(String result) {
        return null;
    }

}
