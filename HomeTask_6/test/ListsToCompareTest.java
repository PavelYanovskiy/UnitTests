import Unittests.HomeTask_6.ListsToCompare;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


public class ListsToCompareTest {

        private ListsToCompare comparator;

        @Test
        public void testCalculateAverage() {
            List<Integer> list = Arrays.asList(5, 6, 7);
            comparator = new ListsToCompare(list, list);
            assertThat(comparator.calculateListAverage(list)).isEqualTo(6.0);
        }

        @Test
        public void testCalculateEmptyList() {
            List<Integer> list = new ArrayList<>();
            comparator = new ListsToCompare(list, list);
            assertThat(comparator.calculateListAverage(list)).isEqualTo(0);
        }

        @Test
        public void testCompareFirstListBigger() {
            List<Integer> list1 = Arrays.asList(4, 5, 6);
            List<Integer> list2 = Arrays.asList(1, 2, 3);
            comparator = new ListsToCompare(list1, list2);
            assertThat(comparator.listsCompare()).isEqualTo("Первый список имеет большее среднее значение");
        }

        @Test
        public void testCompareSecondListBigger() {
            List<Integer> list1 = Arrays.asList(1, 2, 3);
            List<Integer> list2 = Arrays.asList(4, 5, 6);
            comparator = new ListsToCompare(list1, list2);
            assertThat(comparator.listsCompare()).isEqualTo("Второй список имеет большее среднее значение");
        }

        @Test
        public void testComparingListsEqual() {
            List<Integer> list1 = Arrays.asList(5, 1, 3);
            List<Integer> list2 = Arrays.asList(4, 3, 2);
            comparator = new ListsToCompare(list1, list2);
            assertThat(comparator.listsCompare()).isEqualTo("Средние значения равны");
        }
    }