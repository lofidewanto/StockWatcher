package stockwatcher.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.*;

public class StockWatcher implements EntryPoint {

    TabPanel tabPanel = new TabPanel ();
    ResponseFromServerPanel responseFromServerPanel = new ResponseFromServerPanel();
    FileUploadPanel fileUploadPanel = new FileUploadPanel();
    /**
     * Entry point method.
     */
    public void onModuleLoad() {
        VerticalPanel stocksPanel = responseFromServerPanel.createMainPanel();
        VerticalPanel uploadPanel = fileUploadPanel.createVerticalPanel();
        tabPanel.add(uploadPanel, "file upload");
        tabPanel.add(stocksPanel, "response from server");
        RootPanel.get("stockList").add(tabPanel);
    }
}
