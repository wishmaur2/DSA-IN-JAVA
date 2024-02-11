/*Passing Arrays To Functions:-
Arrays can be passed to the functions like this..
*/

#include<stdio.h>
// void printarray(int *ptr,int n);
void printarray(int i[] ,int n);
int main(){
    int arr[]={34,45,56,67,78,89,90};

    // printarray(&arr,7);
    printarray(arr,7);        //function call

    printf("After call changes in arr[2] is %d",arr[2]);

return 0;
}

// void printarray(int *ptr,int n){
//     for(int i=0; i<n;i++){
//         printf("The value of elements %d is %d\n",i,*(ptr+i));
//     }

// }


void printarray(int ptr[],int n){
    for(int i=0; i<n;i++){
        // printf("The value of elements %d is %d\n",i,*(ptr+i));
        printf("The value of elements %d is %d\n",i,ptr[i]);
    }
    ptr[2]=746; //This value will be change in arr array of main function as well..

}


