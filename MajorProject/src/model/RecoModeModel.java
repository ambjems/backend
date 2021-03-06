package model;

public class RecoModeModel {

	private String schoolName;
	private String state;
	private String board;
	private double feeList[] = new double[15];
	private double totalAmount;
	
	public RecoModeModel() {
		super();
	}
	public RecoModeModel(String schoolName, String state, String board, double[] feeList, double totalAmount) {
		super();
		this.schoolName = schoolName;
		this.state = state;
		this.board = board;
		this.feeList = feeList;
		this.totalAmount = totalAmount;
	}
	
	public RecoModeModel(String schoolName, String state, String board, double[] feeList) {
		super();
		this.schoolName = schoolName;
		this.state = state;
		this.board = board;
		this.feeList = feeList;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public double[] getFeeList() {
		return feeList;
	}
	public void setFeeList(double[] feeList) {
		this.feeList = feeList;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
