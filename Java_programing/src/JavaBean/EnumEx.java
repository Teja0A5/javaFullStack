package JavaBean;

public class EnumEx {
	enum Day{
		MONDAY,TUESDAY,WEDNESDAY,FRIDAY,SATURDAY
	}
	public static void main(String[] args) {
		Day today=Day.SATURDAY;
		switch(today)
		{
		case MONDAY:
			System.out.println("monday");
			break;
		case TUESDAY:
			System.out.println("tuesday");
			break;
		case WEDNESDAY:
			System.out.println("wednesday");
			break;
		case FRIDAY:
			System.out.println("friday");
			break;
/*case SATURDAY:
System.out.println("Saturday");
break;*/
			default:
			System.out.println("please give proper value");
		}
	}
}
