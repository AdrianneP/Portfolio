/*  Adrianne Perrodin
	06/20/2021
	Module 7 
	Corner Grocer App */

#include <Python.h>
#include <iostream>
#include <Windows.h>
#include <cmath>
#include <string>
#include <fstream>

using namespace std;

/*
Description:
	To call this function, simply pass the function name in Python that you wish to call.
Example:
	callProcedure("printsomething");
Output:
	Python will print on the screen: Hello from python!
Return:
	None
*/
void CallProcedure(string pName)
{
	char* procname = new char[pName.length() + 1];
	std::strcpy(procname, pName.c_str());

	Py_Initialize();
	PyObject* my_module = PyImport_ImportModule("PythonCode");
	PyErr_Print();
	PyObject* my_function = PyObject_GetAttrString(my_module, procname);
	PyObject* my_result = PyObject_CallObject(my_function, NULL);
	Py_Finalize();

	delete[] procname;
}

/*
Description:
	To call this function, pass the name of the Python functino you wish to call and the string parameter you want to send
Example:
	int x = callIntFunc("PrintMe","Test");
Output:
	Python will print on the screen:
		You sent me: Test
Return:
	100 is returned to the C++
*/
int callIntFunc(string proc, string param)
{
	char* procname = new char[proc.length() + 1];
	std::strcpy(procname, proc.c_str());

	char* paramval = new char[param.length() + 1];
	std::strcpy(paramval, param.c_str());


	PyObject* pName, * pModule, * pDict, * pFunc, * pValue = nullptr, * presult = nullptr;
	// Initialize the Python Interpreter
	Py_Initialize();
	// Build the name object
	pName = PyUnicode_FromString((char*)"PythonCode");
	// Load the module object
	pModule = PyImport_Import(pName);
	// pDict is a borrowed reference 
	pDict = PyModule_GetDict(pModule);
	// pFunc is also a borrowed reference 
	pFunc = PyDict_GetItemString(pDict, procname);
	if (PyCallable_Check(pFunc))
	{
		pValue = Py_BuildValue("(z)", paramval);
		PyErr_Print();
		presult = PyObject_CallObject(pFunc, pValue);
		PyErr_Print();
	}
	else
	{
		PyErr_Print();
	}
	//printf("Result is %d\n", _PyLong_AsInt(presult));
	Py_DECREF(pValue);
	// Clean up
	Py_DECREF(pModule);
	Py_DECREF(pName);
	// Finish the Python Interpreter
	Py_Finalize();

	// clean 
	delete[] procname;
	delete[] paramval;


	return _PyLong_AsInt(presult);
}

/*
Description:
	To call this function, pass the name of the Python functino you wish to call and the string parameter you want to send
Example:
	int x = callIntFunc("doublevalue",5);
Return:
	25 is returned to the C++
*/
int callIntFunc(string proc, int param)
{
	char* procname = new char[proc.length() + 1];
	std::strcpy(procname, proc.c_str());

	PyObject* pName, * pModule, * pDict, * pFunc, * pValue = nullptr, * presult = nullptr;
	// Initialize the Python Interpreter
	Py_Initialize();
	// Build the name object
	pName = PyUnicode_FromString((char*)"PythonCode");
	// Load the module object
	pModule = PyImport_Import(pName);
	// pDict is a borrowed reference 
	pDict = PyModule_GetDict(pModule);
	// pFunc is also a borrowed reference 
	pFunc = PyDict_GetItemString(pDict, procname);
	if (PyCallable_Check(pFunc))
	{
		pValue = Py_BuildValue("(i)", param);
		PyErr_Print();
		presult = PyObject_CallObject(pFunc, pValue);
		PyErr_Print();
	}
	else
	{
		PyErr_Print();
	}
	//printf("Result is %d\n", _PyLong_AsInt(presult));
	Py_DECREF(pValue);
	// Clean up
	Py_DECREF(pModule);
	Py_DECREF(pName);
	// Finish the Python Interpreter
	Py_Finalize();

	// clean 
	delete[] procname;

	return _PyLong_AsInt(presult);
}
// function to display main menu
void mainMenu() {
	cout << "--------------------Corner Grocer Store App---------------------" << endl;
	cout << endl;
	cout << "1 - Print a list of all items purchased with number of times" << endl;
	cout << "2 - Find a specific item and how many times purchased" << endl;
	cout << "3 - Create file and view histogram for items purchased today" << endl;
	cout << "4 - Exit";
	cout << endl;
	cout << "----------------------------------------------------------------" << endl;
	cout << endl;
	
}

// main driver
int main()
{	
	// changes output color
	system("Color F2");  
	
	// local variables
	char userInput;
	string searchWord;
	string item;
	int freq;
	char symbol = '*';
	ifstream file;

	// first intial main menu
	mainMenu();
	cin >> userInput;
	cout << endl;

	// while loop for menu selection
	while (userInput != '4') {
		switch (userInput) {
		case '1':
			CallProcedure("PrintList"); // python function
			cout << endl;
			break;
		case '2':
			cout << "What item are you looking for? ";
			cin >> searchWord;
			cout << searchWord << " ";
			callIntFunc("PrintCount", searchWord); // python function
			cout << endl;
			break;
		case '3':
			CallProcedure("CreateFile"); // python function
			file.open("frequency.dat"); // opens file created in python
			// prints file data to screen as histogram
			while (!file.eof()) {
				file >> item;
				file >> freq;
				cout << item << " "; 
				for (int i = 1; i <= freq; i++) { // reads number then converts to * symbol
					cout << symbol; 
				}
				cout << endl;
			}
			file.close(); // closes file 
			cout << endl;
			break;
		case '4': // exits
			break;
		default: // error message
			cout << "Invalid Input, Please Try Again." << endl;
		}

		mainMenu();
		cin >> userInput;
		cout << endl;
	}

	return 0;
}