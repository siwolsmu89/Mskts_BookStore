package service;

import java.util.ArrayList;

import vo.Rent;
import vo.Book;
import vo.User;

public class RentalService {

	// 연체료
	public static final double LATE_FEE = 0.1;
	
	// 대여 서비스를 처리하기 위해서는 bookService, userService가 모두 필요하다.
	// 매번 필요할 때 새 객체를 만드는 것은 비효율적이므로 위에서 한 번에 선언한다.
	private BookService bookService = new BookService();
//	private UserService userSerivce = new UserService(); 유저서비스는 안 만들어놔서 빨간줄 나니까 일단 주석처리함
	
	private ArrayList<Rent> rentalInfo = new ArrayList<Rent>();

    public RentalService() {
    	// 임의의 Rent를 몇 개 만들어서 rentalInfo에 저장한다. 
    	// Rent 객체
    	//		사용자 정보
    	//		책 정보
    	//		대여일자(오늘보다 과거 날짜로 아무렇게나 등록한다.)
    	//		반납예정일자(대여일자 + 3일)
    }
	
	public void rentBook(User user, Book book) {
		// 입력받은 사용자정보와 일치하는 회원이 있는지 확인한다. (아이디, 이름이 모두 일치하면 통과)
		
		// 책 정보를 검색(제목, 작가, 출판사가 일치하면 통과)하여 책 재고가 0이라면 대여를 허용하지 않는다.
		// 해당 사용자가 동일한 제목의 책을 대여하고 있는 상태라면 대여를 허용하지 않는다.
		
		// 모두 제대로 통과했다면 Rent 객체에 사용자 정보와 책 정보를 저장하고 
		// 대여일자는 오늘, 반납 예정일자는 오늘+3일로 등록한 뒤 rentalInfo에 추가한다.
		
		// 대여 처리가 종료되면 기존에 BookService에 등록되어 있던 책 정보를 삭제하고, 나머지 정보는 동일하고 stock만 1 감소된 책 정보를 다시 등록한다. 
	}
	
	public void returnBook(User user, Book book) {
		// 입력받은 사용자, 책 정보와 일치하는 대여정보가 있는지 확인한다. (사용자 아이디와 책 제목이 일치하면 통과)
		
		// 없다면 일치하는 정보가 없습니다 문장을 표시하고 반납 처리를 종료한다.
		// 있다면 rentalInfo에서 반납 예정일자가 지났는지 확인한다.
		
		// 반납 예정일자가 지나지 않았다면 해당 정보를 삭제한다.
		// 반납 예정일자가 지났다면 연체료를 계산해서 알려주고 해당 정보를 삭제한다.
		
		// 연체료는 대여료 * LATE_FEE * 연체일자(일)로 계산한다.
		// 연체료의 상한선은 책 가격이다. (책 가격을 넘어가면 책 가격만큼만 받는다)
		// 연체일자는 소숫점을 버리고 계산한다.
		
		// 반납 처리가 종료되면 기존에 BookService에 등록되어 있던 책 정보를 삭제하고, 나머지 정보는 동일하고 stock만 1 증가된 책 정보를 다시 등록한다.
	}
	
	// 아래는 대여 상태 조회 메뉴이다.
	// 파라미터를 보고 내용을 구현해 본다.
	public void selectRental(User user) {}
	
	public void selectRental(Book book) {}
}
