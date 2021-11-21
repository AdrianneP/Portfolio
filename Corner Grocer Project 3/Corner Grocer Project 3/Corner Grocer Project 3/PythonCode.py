# Adrianne Perroidn
# 06/19/2021
# Module 7
# Corner Grocer App

import re
import string
import os

# function for reading already existing file
def PrintList():
   
    file_list = "Grocery File.txt"

    # reads file and sorts into list
    with open(file_list, 'r') as grocery_list:
        for line in grocery_list:
            list_words = list(grocery_list)
            collect_items = set(list_words)
            
    # counts the amount of times each item appears
    for item in collect_items:
        # formatted to remove \n at end of each item before printing to screen
        print("{}: {}".format (item.strip('\n'), list_words.count(item)))


    # counts the number of item user selects in c++
def PrintCount(v):
    file_list = open("Grocery File.txt").read()
    count = file_list.count(v)
    print(count)

    return 0;
    

    # reads existing file then writes data to new file
def CreateFile():

    file_list = "Grocery File.txt" # existing file
    file_create = open("frequency.dat", "w") # new file
  
    with open(file_list, 'r') as grocery_list:
        for line in grocery_list:
            list_words = list(grocery_list)
            collect_items = set(list_words)
            
    for item in collect_items:
        # formatted to remove \n at end of each item before printing to screen
        file_create.write("{} {}\n".format (item.strip('\n'), list_words.count(item)))

    file_create.close() # closes created file
    
