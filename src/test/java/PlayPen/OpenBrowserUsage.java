package PlayPen;

import BaseClass.OpenBrowser;
import org.junit.Test;

import java.io.IOException;

public class OpenBrowserUsage {

    @Test
    public void test() throws IOException {
        OpenBrowser.NavToWebsite("EchoUrl");
        OpenBrowser.CloseBrowser();
    }
}
