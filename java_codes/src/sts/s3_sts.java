#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    cout<<"Sample Result\n";
    cout<<"Give the number of bits for the message: ";
    int n;
    cin>>n;
    int multiplier = 1;
    while(multiplier*1024<(n+128))
    {
        multiplier++;
    }
    int padding_size = (multiplier*1024)-(n+128);
    cout<<endl<<endl<<"Original message length (bits): "<<n<<endl;
    cout<<"The size of the padding Bits is : "<<padding_size<<endl;
    cout<<"The total size of the blocks after including the padding bits is: "<<padding_size+n+128<<endl;
    string paddingBitsString = "1"+string(padding_size - 1, '0');
    cout<<"The padding bits are as below, along with the number of bits (excluding the size of the message{128}): "<<paddingBitsString<<endl<<"Size of padding bits:"<<paddingBitsString.length()<<endl;
    cout<<"Total blocks required: "<<multiplier;
    return 0;
}
