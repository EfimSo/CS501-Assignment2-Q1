import pandas as pd
import numpy as np

# CSV Dataset downloaded from Kaggle 
# https://www.kaggle.com/datasets/mattimansha/inspirational-quotes

df = pd.read_csv("./insperation.csv")
df = df.iloc[:, [1, 2]]                 # Extract "Category" and "Quotes" from CSV

df["Category"] = pd.Series(map(lambda word : word.lower().capitalize(), df["Category"]))      # capitalize Category
df = df.iloc[np.random.randint(df.shape[0], size=50), :]                                      # Select 50 random quotes

# Join to a string for Kotlin hardcoding import
make_string = lambda data: f'listOf("{"\", \n\"".join(data.tolist())}")'
category, quotes = make_string(df["Category"]), make_string(df["Quote"])

print(category)
print(quotes)

