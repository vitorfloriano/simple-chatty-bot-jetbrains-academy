import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;
import org.hyperskill.hstest.testcase.TestCase;

import java.util.Arrays;
import java.util.List;

public class ChattyBotTest extends StageTest<String> {

    @Override
    public List<TestCase<String>> generate() {
        return Arrays.asList(
            new TestCase<String>()
                .setInput("John")
                .setAttach("John"),

            new TestCase<String>()
                .setInput("Nick")
                .setAttach("Nick")
        );
    }

    @Override
    public CheckResult check(String reply, String clue) {

        String[] lines = reply.trim().split("\n");

        if (lines.length != 4) {
            return CheckResult.wrong(
                "You should output 4 lines. " +
                    "Lines found: " + lines.length + "\n" +
                    "Your output:\n" +
                    reply
            );
        }

        String lineWithName = lines[3].toLowerCase();
        String name = clue.toLowerCase();

        if (!lineWithName.contains(name)) {
            return CheckResult.wrong(
                "The name was " + clue + "\n" +
                    "But the 4-th line was:\n" +
                    "\"" + lines[3] + "\"\n\n" +
                    "4-th line should contain a name of the user"
            );
        }

        return CheckResult.correct();
    }

}
