package stockwatcher.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("")
public interface StockPriceService extends RemoteService {

    StockPrice[] getPrices(String[] symbols);
}
