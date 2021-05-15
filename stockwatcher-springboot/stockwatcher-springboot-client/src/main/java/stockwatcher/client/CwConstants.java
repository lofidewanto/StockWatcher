package stockwatcher.client;

import com.google.gwt.i18n.client.Constants;

/**
 * The constants used in this Content Widget.
 */
public interface CwConstants extends Constants {
	@DefaultStringValue("FileUpload")
	String cwFileUploadButton();

	@DefaultStringValue("Upload")
	String cwFileUploadDescription();

	@DefaultStringValue("FileUploadName")
	String cwFileUploadName();

	@DefaultStringValue("No File")
	String cwFileUploadNoFileError();

	@DefaultStringValue("Select the File")
	String cwFileUploadSelectFile();

	@DefaultStringValue("Success!!!")
	String cwFileUploadSuccessful();
}