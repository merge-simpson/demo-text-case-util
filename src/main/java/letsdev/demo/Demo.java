package letsdev.demo;

import letsdev.common.log.AdaptiveLogger;
import letsdev.common.log.AdaptiveLogger.LevelFixedLogger;
import letsdev.common.log.LogLevel;
import letsdev.common.util.text.TextCaseUtil;
import org.springframework.http.HttpStatus;

public class Demo {
    private static final AdaptiveLogger adaptiveLogger = AdaptiveLogger.getLogger(Demo.class);
    private final LevelFixedLogger logger;

    public Demo(LogLevel logLevel) {
        this.logger = adaptiveLogger.with(logLevel);
    }

    public void measure(HttpStatus status) {
        long t0, t1;

        t0 = System.nanoTime();
        String capitalizedText = TextCaseUtil.capitalizeAndSaveUpperSnakeCase(
                status.name()
        );
        t1 = System.nanoTime();

        logger.log("time: {} ns to capitalize: {}", t1 - t0, capitalizedText);
    }
}
