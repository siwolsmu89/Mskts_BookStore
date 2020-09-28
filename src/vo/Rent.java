package vo;

import java.util.Date;

public class Rent {

	private User user;
	
	private Book book;
	
	// 대여료는 책 가격의 10%
	private long rentPrice;
	
	private Date rentDate;
	
	private Date returnDate;
	
}
