#include <stdio.h>
int main()
{
    int T;
    scanf("%d", &T); // testcase

    for (int i = 0; i < T; i++)
    {
        int H, W, N;

        scanf("%d %d %d", &H, &W, &N);

        if (N <= H)
            printf("%d\n", N * 100 + 1); //호수 계산 후 출력
        else
        {
            if (N % H == 0)
                printf("%d\n", (100 * H) + (N / H)); // 마지막 층

            else
                printf("%d\n", (N % H) * 100 + 1 + (N / H)); //호수 계산 후 출력
        }
    }

    return 0;
}