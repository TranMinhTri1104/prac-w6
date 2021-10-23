package routine;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class TestListener implements ITestListener {

    @Override
    public void onFinish(ITestContext result) {

    }

    @Override
    public void onStart(ITestContext result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Đay la test case bi fail: " + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Đay la test case bi bo qua: " + result.getName());

    }

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Đay là test case chay thanh cong: " + result.getName());

    }
}