package stockwatcher.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;

public class FileUploadPanel {
    /**
     * An instance of the constants.
     */
    private final CwConstants constants;

    public FileUploadPanel() {
        constants = (CwConstants) GWT.create(CwConstants.class);
    }

    /**
     * Initialize this example.
     */
    public VerticalPanel createVerticalPanel() {
        // Create a vertical panel to align the content
        VerticalPanel vPanel = new VerticalPanel();

        // Add a label
        vPanel.add(new HTML(constants.cwFileUploadSelectFile()));

        // Add a file upload widget
        final FileUpload fileUpload = new FileUpload();
        fileUpload.ensureDebugId("cwFileUpload");
        vPanel.add(fileUpload);

        // Add a button to upload the file
        Button uploadButton = new Button(constants.cwFileUploadButton());
        uploadButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                String filename = fileUpload.getFilename();
                if (filename.length() == 0) {
                    Window.alert(constants.cwFileUploadNoFileError());
                } else {
                    Window.alert(constants.cwFileUploadSuccessful());
                }
            }
        });
        vPanel.add(new HTML("<br>"));
        vPanel.add(uploadButton);

        // Return the layout panel
        return vPanel;
    }
}
