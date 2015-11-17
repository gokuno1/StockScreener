package com.oak.external.finance.app.marketdata.api;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import com.oak.api.finance.model.Stock;
import com.oak.api.finance.model.economy.Economic;

public interface DataConnector {

	Map<Stock, Map<Date, Economic>> 
	getEconomics(
			Set<String> stocks,
			Date fromDate);
	
}
