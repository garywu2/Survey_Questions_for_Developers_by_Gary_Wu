#include <iostream>
#include <string.h>

using namespace std;

/*
 * Takes the userinputed string and converts all
 * vowels to lowercase and all consonants to uppercase
 */
string ChangeCase(string userInput) {
    //Array with all uppercase vowels
    char vowels[] = {'A', 'E', 'I', 'O', 'U', 'Y'};
    char temp[userInput.length() + 1];
    string answer;
    //Converts the user input into a charArray
    strcpy(temp, userInput.c_str());

    //Loop runs through every letter make sure it is a letter before changing
    //it to uppercase and then checking if it is a vowel and if it is change
    //it to lower case
    for(int i = 0; i < userInput.length(); i++) {
        //Makes sure that the character is a letter
        if(temp[i] >= 'a' && temp[i] <= 'z' || temp[i] >= 'A' && temp[i] <= 'Z') {
            //Changes it to lower case
            temp[i] = toupper(temp[i]);
            //Checks to see if it is a vowel
            for(int j = 0; j < sizeof(vowels); j++) {
                if(temp[i] == vowels[j]) {
                    //Changes it to lower case
                    temp[i] = tolower(temp[i]);
                }
            }
        }
    }
    answer = std::string(temp);
    return answer;
}

int main()
{
    cout << ChangeCase("alphabet") << endl;
    cout << ChangeCase("yesterday") << endl;
    return 0;
}
