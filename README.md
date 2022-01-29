# Employee-Management-System-Java

<b>Employee Management System using Bootstrap, JQuery, Java Servlets, JSP with SQLite Database</b>

<i>This is a simple management system which automates daily tasks of employees in a workplace. </i>

There are 2 views: <br>
### Admin View ###
* The administrator can view hours worked by employee and view salary earned so far by each employee by typing employee username in searchbox
* The administrator can approve/not approve leave request filed by employees. If the request is approved, employee can view in his leave page that his leave is approved.
* The administrator can view all employees in the company and delete employees/update their salary

### Employee View ###
* The employee can log in attendance by submitting enter time and exit time for that particular day
* The employee can view his own salary earned so far
* The employee can submit request to take leave and specify reason. It can be approved/not approved by administrator
* The employee can view his profile

<hr>

## Contents ##

1.  [Home Page](#home-page)  
2.  [Registration](#registration)
3.  [Login](#login)
4.  [Employee and Admin Dashboard](#dashboard)
5.  [View Employee List/Update Employee Salary/Delete Employee](#view_emp)
6.  [View Employee Profile](#view_profile)
7.  [View Employee Salary](#view_sal)
8.  [Mark attendance](#attn)
9.  [Check employee attendance from Admin](#check_attn)
10. [Leave request submission, approval, checking approved leave](#leave)

<hr>

<h2 id="home-page"> Home Page </h2>


![image](https://user-images.githubusercontent.com/29352643/151649951-4719c9f8-fb65-4c6c-95f4-b20017c4dd14.png)

<hr>

<h2 id="registration"> I. Registration </h2>

Client side validation for firstname, lastname, username, phone number, email address, password and confirm password implemented using JQuery.

### Page 1 ###


![image](https://user-images.githubusercontent.com/29352643/151650032-1b83d5d8-30cd-4c02-908e-0a7696b3ab68.png)


### Page 2 ###


![image](https://user-images.githubusercontent.com/29352643/151650077-ba646eb2-181d-45d9-8bc2-e7c710ffe282.png)


### Page 3 ###

Example of validation output: In this case, passwords don't match. If there is any validation error and submit button is clicked, account registration fails and user is redirected to the home page.

![image](https://user-images.githubusercontent.com/29352643/151650192-7c5a82e3-58bf-4751-8926-eec7474643bc.png)

Now once submit button is clicked with no validation error, account created.

![image](https://user-images.githubusercontent.com/29352643/151650275-3b267001-f761-4260-b221-e0c4a73996f0.png)

<hr>


<h2 id="login">Login</h2>

By default, account is registered with role as 'employee'

![image](https://user-images.githubusercontent.com/29352643/151650442-49bfb901-6264-4a86-bb50-d149ea04099d.png)

If credentials incorrect, error message displayed.

<hr>

<h2 id="dashboard"> III. Dashboard </h2>

#### Employee ####

![image](https://user-images.githubusercontent.com/29352643/151650474-a95cf579-3644-4506-af38-d17eb6a97297.png)

#### Admin ####

'adikumar' username account is the only Admin account created in the database

![image](https://user-images.githubusercontent.com/29352643/151650488-95e03d83-8543-4668-b958-0dce0f11b185.png)

<h2 id="view_emp"> IV. View Employee Details/Delete Employee/Update Employee Salary from Admin </h2>

Table display, updation, deletion done with AJAX 

* List of employees 

![image](https://user-images.githubusercontent.com/29352643/151650729-c3346f0e-297a-41dc-bb1c-a8fd7d74869a.png)

* Updating an employee salary

![image](https://user-images.githubusercontent.com/29352643/151650814-a4ec5e4b-ec58-4048-b130-02daf7f0d9ea.png)

* Table after updating

![image](https://user-images.githubusercontent.com/29352643/151650830-0147e64e-21aa-4d99-a8ce-37f3ca145fec.png)

<hr>

<h2 id="view_profile"> V. View an employee profile from Employee View </h2>

E.g account logged in here is Employee 'Michael Scott' 

![image](https://user-images.githubusercontent.com/29352643/151650963-b519dc41-1cda-4659-8407-ea666bd3bcd0.png)

<hr>

<h2 id="view_sal"> VI. View salary of employee for the month </h2>

Employee must work minimum of 130 hours to get monthly salary per company policy. According to hours worked, salary is calculated.

![image](https://user-images.githubusercontent.com/29352643/151651011-c740f451-a1da-4d89-b9c8-ead401e1c101.png)

<hr>

<h2 id="attn"> VII. Log in attendance (enter time, exit time) and submit to admin </h2>

![image](https://user-images.githubusercontent.com/29352643/151651060-c40e489c-26d5-42c0-9bb7-51fc7d01bf55.png)

On submitting, hours is added to hours worked. 

![image](https://user-images.githubusercontent.com/29352643/151651084-732d473f-e776-4a50-860f-efec9e02bf9e.png)

<hr>

<h2 id="check_attn"> VIII. Check employee hours worked and salary earned so far in admin view </h2>

Type employee username in searchbox to show that particular employee details. Implemented using AJAX 

For employee 'Michael Scott'

![image](https://user-images.githubusercontent.com/29352643/151651114-c737d981-98a6-4b82-9b00-44b32deefe31.png)

For employee 'Toby Flenderson'

![image](https://user-images.githubusercontent.com/29352643/151651131-990466a4-5bea-4ee6-9be1-e8b62a291aec.png)

<hr>

<h2 id="leave"> IX. Leave request submission, approval and checking </h2>

Logged in from employee 'Will Smith'

![image](https://user-images.githubusercontent.com/29352643/151651418-4c5fc9c6-2c7d-4588-bc36-94ad37a593b2.png)

Now once submit entered, admin should approve

![image](https://user-images.githubusercontent.com/29352643/151651452-eaddba8c-799e-42e7-8568-e57c4b88440f.png)

![image](https://user-images.githubusercontent.com/29352643/151651468-fec8c6ec-0696-48f4-bd22-dc9b59f4eacd.png)

Admin approves the leave

![image](https://user-images.githubusercontent.com/29352643/151651475-133675aa-8e84-4c3f-9a5b-c2b7f65bc43f.png)

Employee can check his list of approved leaves now 

![image](https://user-images.githubusercontent.com/29352643/151651541-3960bfbf-f835-4289-89e2-8ec40f7532e2.png)

<hr>

## Conclusion ##

Further improvements to the site are being implemented.

