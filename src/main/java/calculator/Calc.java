package calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calc {

    private Logger _logger;

    /**
     *
     */
    public Calc() {
        _logger = LoggerFactory.getLogger(getClass().getSimpleName());
    }

    /**
     * 
     */
    public int add(int a, int b) {
        int result = 0;
        result = a + b;
        if (_logger.isDebugEnabled())
            _logger.debug("{} + {} = {}", a, b, result);
        return result;
    }

    /**
     * 
     */
    public int subtract(int a, int b) {
        int result = 0;
        result = a - b;
        if (_logger.isDebugEnabled())
            _logger.debug("{} - {} = {}", a, b, result);
        return result;
    }

    /**
     * 
     */
    public int multiply(int a, int b) {
        int result = 0;
        result = a * b;
        if (_logger.isDebugEnabled())
            _logger.debug("{} * {} = {}", a, b, result);
        return result;
    }

    /**
     * 
     */
    public int divide(int a, int b) {
        int result = 0;
        result = a / b;
        if (_logger.isDebugEnabled())
            _logger.debug("{} / {} = {}", a, b, result);
        return result;
    }
}
