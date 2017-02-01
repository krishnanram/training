package ch07_object_oriented_design.Q7_02_Call_Center;

class Respondent extends Employee {
    public Respondent(CallHandler callHandler) {
    	super(callHandler);
    	rank = Rank.Responder;
    }
}
