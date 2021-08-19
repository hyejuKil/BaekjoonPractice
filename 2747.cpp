#include <stdio.h>

int main() {
	int input = 0;
	scanf("%d", &input);
	
	int dp[46];
	
	dp[0] = 0;
	dp[1] = 1;

	for (int i = 2; i <= input; i++)
	{
		dp[i] = dp[i - 2] + dp[i - 1];
	}

	printf("%d", dp[input]);
}