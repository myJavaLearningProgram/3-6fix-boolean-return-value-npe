package com.github.hcsp.datatype;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LightTest {
    @Test
    @CaptureSystemOutput
    public void test(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("状态未知的灯亮着吗：false"));
        capture.expect(Matchers.containsString("亮着的灯亮着吗：true"));
        capture.expect(Matchers.containsString("灭了的灯亮着吗：false"));
        Main.main(null);
    }

    @Test
    public void keepRawValue() {
        Assertions.assertEquals(null, new Light(null).isOnRawValue());
    }
}
