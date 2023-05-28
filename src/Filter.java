import java.util.ArrayList;
import java.util.List;

class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer num : source) {
            if (num >= threshold) {
                logger.log("Элемент \"" + num + "\" проходит");
                result.add(num);
            } else {
                logger.log("Элемент \"" + num + "\" не проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }
}