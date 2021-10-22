package CucumberScripts;

import BaseClass.OpenBrowser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AT02_NavigateToEchosite {
    @Test
    public static void NavEchosite() throws IOException {
        OpenBrowser.NavToWebsite("EchoUrl");


    }
}
