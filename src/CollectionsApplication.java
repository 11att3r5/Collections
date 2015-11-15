import java.util.*;


public class CollectionsApplication 
{

	public static void main(String[] args) 
	{
		//Map for employees to be stored and retrieved
		Map<String, Employee> myMap = new TreeMap<>();
		
		createMap(myMap);
	}	
	
	
	//method for entering NEW employees
	private static void createMap(Map<String, Employee> map)
	{
		int inputOption;
		String inputId;
		
		// Scanner Object for user to input info
		Scanner scanner = new Scanner(System.in);
		
		//List options - loop these options after each operation
		do 
		{
		System.out.println("Select an option from the choices below \n"
						+ "1 - Add an employee \n"
						+ "2 - Change an employees salary \n"
						+ "3 - Delete an employee \n"
						+ "4 - List an employee \n"
						+ "5 - List all employees \n"
						+ "Enter any other number to exit.");
		//Check to see if input equals and integer
		while(!scanner.hasNextInt())
		{
			scanner.nextLine();
			System.out.println("Please enter a valid value.");
		}
		//After user inputs a valid request
		inputOption = scanner.nextInt();
				 
		//Actions for each number
				if(inputOption == 1)
				{
					//create new employee
					Employee x = new Employee(null,null,null,null);
					x.getEmpId(null);
					x.getLastName(null);
					x.getFirstName(null);
					x.getAnnualSalary(null);
					
					//Prompt user for each value
					System.out.println("Enter employee Id number:");
					inputId = scanner.next();
					System.out.println("Enter employees last name:");
					String inputLastName = scanner.next();
					System.out.println("Enter employees first name:");
					String inputFirstName = scanner.next();
					System.out.println("Enter employees salary:");
					String inputSalary = scanner.next();		
					Double inSalary = Double.parseDouble(inputSalary);
					
					//Check for duplicate key
					if(map.containsKey(inputId))
					{
						System.out.println("That employee already exist!\n");
					}
					else
					{
						//set values
						x.setEmpId(inputId);
						x.setLastName(inputLastName);
						x.setFirstName(inputFirstName);
						x.setAnnualSalary(inSalary);
						//add new employee object with id as key
						map.put(inputId , x );
					}
					
				}
				else if (inputOption == 2)
				{
					//get employee id(key).
					System.out.println("Enter employee Id:");
					inputId = scanner.next();
					if(!map.containsKey(inputId))
					{
						System.out.println("That employee does not exist!\n");
					}
					else
					{
						Employee employeeSalary = map.get(inputId);
						//Change employee salary
						System.out.println("Enter new Salary:");
						String newSalary = scanner.next();
						Double newPay = Double.parseDouble(newSalary);
						employeeSalary.setAnnualSalary(newPay);
					}
				}
				else if (inputOption == 3)
				{
					//get employee id
					System.out.println("Enter employee Id:");
					inputId = scanner.next();
					if(!map.containsKey(inputId))
					{
						System.out.println("That employee does not exist!\n");
					}
					else
					{
						//remove employee
						map.remove(inputId);
						System.out.println("Employee " + inputId + " has been removed.\n");
					}
				}
				else if (inputOption == 4)
				{
					//get employee id
					System.out.println("Enter employee Id:");
					inputId = scanner.next();
					if(!map.containsKey(inputId))
					{
						System.out.println("That employee does not exist!\n");
					}
					else
					{
						//list employee properties
						System.out.println("" + map.get(inputId) + "\n");
					}
				}
				else if (inputOption == 5)
				{
					//List all employees
					Set<Map.Entry<String, Employee>> myMapSet = map.entrySet();
					for(Map.Entry<String, Employee> key : myMapSet)
					{
						System.out.println("" + key.getValue() + "\n");
					}
				}
				else 
				{
					System.out.println("Thanks for using the employee maintenance application!");
					System.exit(0);
				}
		}
		while((1<=inputOption) && (inputOption<=5));
		scanner.close();
	}

}
