#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int random(int n)
{
    srand(time(NULL));
    return rand() % n;
}
int main()
{
    // 0->rock  1->paper  2->scissor
    
    int a, b;
    char name[10];
    printf("enter your name : ");
    gets(name);
    printf("%s your tern : ",name);
    scanf("%d", &a);
    if (a > 2 || a < 0)
    {
        printf("enter valid input...\n");
        exit(0);
    }
    printf("computer tern : ");
    b = random(3);
    printf("%d\n", b);
    if ((a == 0 && b == 1) || (a == 1 & b == 2) || (a == 2 && b == 0))
    {
        printf("Computer wins...\n");
    }
    else if ((a == 0 && b == 0) || (a == 1 & b == 1) || (a == 2 && b == 2))
    {
        printf("ohh it's tie...\n");
    }
    else
    {
        printf("you wins...\n");
    }
}
