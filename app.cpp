#include <iostream>
using namespace std;

int main () {
    int x;
    cout << "Enter a number: ";
    cin >> x;
    cout << "You've Entered: " << x <<"\n";
    for(int i=1; i<=x; i++) {
        cout << i << ": Let's CODE\n";
    }
    return 0;
}