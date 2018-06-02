import org.junit.runner.JUnitCore;//загрузка JunitCore класса.
import org.junit.runner.Result;//для загрузки Result class, чтобы вывести результаты запуска тестов.
import org.junit.runner.notification.Failure;// для загрузки Failure class, чтобы получить результаты с ошибками

public class TestRunnerSqrt {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SqrtTest3.class);
        System.out.println("Total number of tests " + result.getRunCount());////This is to get the failure count from the result object
        System.out.println("Total number of tests failed " + result.getFailureCount());////This is to get the failure count from the result object
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
