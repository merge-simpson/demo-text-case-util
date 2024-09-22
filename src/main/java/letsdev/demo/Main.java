// remove package name to use unnamed class

import letsdev.common.log.LogLevel;
import letsdev.demo.Demo;
import org.springframework.http.HttpStatus;

void main() throws ClassNotFoundException {
    Class.forName("letsdev.common.util.text.TextCaseUtil$TextCaseUtilCachedMapHolder");

    Demo demo = new Demo(LogLevel.INFO);
    demo.measure(HttpStatus.NOT_FOUND);
    demo.measure(HttpStatus.NOT_FOUND);
    demo.measure(HttpStatus.NOT_FOUND);
    demo.measure(HttpStatus.NOT_FOUND);
    demo.measure(HttpStatus.NOT_FOUND);

    // method cached
    demo.measure(HttpStatus.INTERNAL_SERVER_ERROR);
    demo.measure(HttpStatus.INTERNAL_SERVER_ERROR);
    demo.measure(HttpStatus.INTERNAL_SERVER_ERROR);
    demo.measure(HttpStatus.INTERNAL_SERVER_ERROR);
    demo.measure(HttpStatus.INTERNAL_SERVER_ERROR);

    /*
    //
    2024-09-23 07:34:10.682 [main] INFO letsdev.demo.Demo - time: 320000 ns to capitalize: Not Found
    2024-09-23 07:34:10.683 [main] INFO letsdev.demo.Demo - time: 1750 ns to capitalize: Not Found
    2024-09-23 07:34:10.683 [main] INFO letsdev.demo.Demo - time: 917 ns to capitalize: Not Found
    2024-09-23 07:34:10.683 [main] INFO letsdev.demo.Demo - time: 875 ns to capitalize: Not Found
    2024-09-23 07:34:10.683 [main] INFO letsdev.demo.Demo - time: 625 ns to capitalize: Not Found
    2024-09-23 07:34:10.683 [main] INFO letsdev.demo.Demo - time: 5083 ns to capitalize: Internal Server Error
    2024-09-23 07:34:10.683 [main] INFO letsdev.demo.Demo - time: 1208 ns to capitalize: Internal Server Error
    2024-09-23 07:34:10.683 [main] INFO letsdev.demo.Demo - time: 875 ns to capitalize: Internal Server Error
    2024-09-23 07:34:10.683 [main] INFO letsdev.demo.Demo - time: 792 ns to capitalize: Internal Server Error
    2024-09-23 07:34:10.683 [main] INFO letsdev.demo.Demo - time: 834 ns to capitalize: Internal Server Error
    */
}
