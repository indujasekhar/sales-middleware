package com.sales.erp.query;

import org.springframework.stereotype.Component;

@Component
public class DailyBookQuery {

	public static String FETCH_DAILY_BOOK_LIST = "SELECT Particular_ID, [User_ID], Amount,Daily_Book_Date,Daily_Book_ID\r\n"
			+ "FROM Daily_Book\r\n" + "ORDER BY Daily_Book_ID DESC\r\n" + "OFFSET ((@PageNumber - 1) * 10) ROWS\r\n"
			+ "FETCH NEXT 10 ROWS ONLY";
}
