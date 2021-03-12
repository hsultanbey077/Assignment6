package Factory.Dialog;

import Factory.Button.Button;
import Factory.Button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

