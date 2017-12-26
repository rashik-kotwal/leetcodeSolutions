//BUY AND SELL STOCK II

        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
        
        
/*The key point is we need to consider every peak immediately following a valley to maximize the profit. 
In case we skip one of the peaks (trying to obtain more profit),
we will end up losing the profit over one of the transactions leading to an overall lesser profit.*/
