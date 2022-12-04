/***
 * This class contains all departments informations.
 */

package com.greatleaning.corejava;

class SuperDepartment {

	String departmentName() {

		return "Super Department";
	}

	String getTodaysWork() {

		return "No Work as of now";
	}

	String getWorkDeadline() {

		return "Nil";
	}

	String isTodayHoliday() {

		return "Today is not a holiday";
	}

}

class AdminDepartment extends SuperDepartment {

	String departmentName() {

		return "Welcome to Admin Department";
	}

	String getTodaysWork() {

		return "Complete your documents submission";
	}

	String getWorkDeadline() {

		return "Complete by EOD";
	}

}

class HrDepartment extends SuperDepartment {

	String departmentName() {

		return "\nWelcome to HR Department";
	}

	String getTodaysWork() {

		return "Fill today's timesheet and mark your attendance";
	}

	String getWorkDeadline() {

		return "Complete by EOD";
	}

	String doActivity() {

		return "team Lunch";
	}

}

class TechDepartment extends SuperDepartment {

	String departmentName() {

		return "\nWelcome to Tech Department";
	}

	String getTodaysWork() {

		return "Complete coding of module 1";
	}

	String getWorkDeadline() {

		return "Complete by EOD";
	}

	String getTechStackInformation() {

		return "Core Java";
	}

}