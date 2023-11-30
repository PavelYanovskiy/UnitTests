package HomeTask_6;
import java.util.List;
public class ListsToCompare {

        public List<Integer> list1;
        public List<Integer> list2;

        public ListsToCompare(List<Integer> list1, List<Integer> list2) {
            this.list1 = list1;
            this.list2 = list2;
        }

        public double calculateListAverage(List<Integer> numList) {
            if (numList.isEmpty()) {
                return 0;
            }
            int sum = 0;
            for (int num : numList) {
                sum += num;
            }
            return (double) sum / numList.size();
        }

        public String listsCompare() {
            double average1 = calculateListAverage(list1);
            double average2 = calculateListAverage(list2);

            if (average1 > average2) {
                return "Первый список имеет большее среднее значение";
            } else if (average1 < average2) {
                return "Второй список имеет большее среднее значение";
            } else {
                return "Средние значения равны";
            }
        }
    }
