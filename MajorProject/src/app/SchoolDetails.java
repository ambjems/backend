package app;

public class SchoolDetails {

	private String id;
	private String school_name;
	private String state;
	private String board;
	private String nursery;
	private String lkg;
	private String ukg;
	private String class1;
	private String class2;
	private String class3;
	private String class4;
	private String class5;
	private String class6;
	private String class7;
	private String class8;
	private String class9;
	private String class10;
	private String class11;
	private String class12;
	
	public SchoolDetails() {
		super();
	}
	
	public SchoolDetails(String id, String school_name, String state, String board, String nursery, String lkg,
			String ukg, String class1, String class2, String class3, String class4, String class5, String class6,
			String class7, String class8, String class9, String class10, String class11, String class12) {
		super();
		this.id = id;
		this.school_name = school_name;
		this.state = state;
		this.board = board;
		this.nursery = nursery;
		this.lkg = lkg;
		this.ukg = ukg;
		this.class1 = class1;
		this.class2 = class2;
		this.class3 = class3;
		this.class4 = class4;
		this.class5 = class5;
		this.class6 = class6;
		this.class7 = class7;
		this.class8 = class8;
		this.class9 = class9;
		this.class10 = class10;
		this.class11 = class11;
		this.class12 = class12;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		try {
			if(id.isEmpty()) {
				this.id=null;
			}
			else {
				this.id=id;
			}
		}catch(NullPointerException ne){
			this.id=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		try {
			if(school_name.isEmpty()) {
				this.school_name=null;
			}
			else {
				this.school_name=school_name;
			}
		}catch(NullPointerException ne){
			this.school_name=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		try {
			if(state.isEmpty()) {
				this.state=null;
			}
			else {
				this.state=state;
			}
		}catch(NullPointerException ne){
			this.state=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		try {
			if(board.isEmpty()) {
				this.board=null;
			}
			else {
				this.board=board;
			}
		}catch(NullPointerException ne){
			this.board=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getNursery() {
		return nursery;
	}
	public void setNursery(String nursery) {
		try {
			if(nursery.isEmpty()) {
				this.nursery=null;
			}
			else {
				this.nursery=nursery;
			}
		}catch(NullPointerException ne){
			this.nursery=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getLkg() {
		return lkg;
	}
	public void setLkg(String lkg) {
		try {
			if(lkg.isEmpty()) {
				this.lkg=null;
			}
			else {
				this.lkg=lkg;
			}
		}catch(NullPointerException ne){
			this.lkg=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getUkg() {
		return ukg;
	}
	public void setUkg(String ukg) {
		try {
			if(ukg.isEmpty()) {
				this.ukg=null;
			}
			else {
				this.ukg=ukg;
			}
		}catch(NullPointerException ne){
			this.ukg=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getClass1() {
		return class1;
	}
	public void setClass1(String class1) {
		try {
			if(class1.isEmpty()) {
				this.class1=null;
			}
			else {
				this.class1=class1;
			}
		}catch(NullPointerException ne){
			this.class1=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getClass2() {
		return class2;
	}
	public void setClass2(String class2) {
		try {
			if(class2.isEmpty()) {
				this.class2=null;
			}
			else {
				this.class2=class2;
			}
		}catch(NullPointerException ne){
			this.class2=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getClass3() {
		return class3;
	}
	public void setClass3(String class3) {
		try {
			if(class3.isEmpty()) {
				this.class3=null;
			}
			else {
				this.class3=class3;
			}
		}catch(NullPointerException ne){
			this.class3=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getClass4() {
		return class4;
	}
	public void setClass4(String class4) {
		try {
			if(class4.isEmpty()) {
				this.class4=null;
			}
			else {
				this.class4=class4;
			}
		}catch(NullPointerException ne){
			this.class4=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getClass5() {
		return class5;
	}
	public void setClass5(String class5) {
		try {
			if(class5.isEmpty()) {
				this.class5=null;
			}
			else {
				this.class5=class5;
			}
		}catch(NullPointerException ne){
			this.class5=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getClass6() {
		return class6;
	}
	public void setClass6(String class6) {
		try {
			if(class6.isEmpty()) {
				this.class6=null;
			}
			else {
				this.class6=class6;
			}
		}catch(NullPointerException ne){
			this.class6=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getClass7() {
		return class7;
	}
	public void setClass7(String class7) {
		try {
			if(class7.isEmpty()) {
				this.class7=null;
			}
			else {
				this.class7=class7;
			}
		}catch(NullPointerException ne){
			this.class7=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getClass8() {
		return class8;
	}
	public void setClass8(String class8) {
		try {
			if(class8.isEmpty()) {
				this.class8=null;
			}
			else {
				this.class8=class8;
			}
		}catch(NullPointerException ne){
			this.class8=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getClass9() {
		return class9;
	}
	public void setClass9(String class9) {
		try {
			if(class9.isEmpty()) {
				this.class9=null;
			}
			else {
				this.class9=class9;
			}
		}catch(NullPointerException ne){
			this.class9=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getClass10() {
		return class10;
	}
	public void setClass10(String class10) {
		try {
			if(class10.isEmpty()) {
				this.class10=null;
			}
			else {
				this.class10=class10;
			}
		}catch(NullPointerException ne){
			this.class10=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getClass11() {
		return class11;
	}
	public void setClass11(String class11) {
		try {
			if(class11.isEmpty()) {
				this.class11=null;
			}
			else {
				this.class11=class11;
			}
		}catch(NullPointerException ne){
			this.class11=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getClass12() {
		return class12;
	}
	public void setClass12(String class12) {
		try {
			if(class12.isEmpty()) {
				this.class12=null;
			}
			else {
				this.class12=class12;
			}
		}catch(NullPointerException ne){
			this.class12=null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
