'''
>>> data = createDataStructure()
>>> getCoordinates("Youngstown OH", data)
[4110, 8065]
>>> getPopulation("Youngstown OH", data)
115436
>>> getDistance("Youngstown OH", "Ravenna OH", data)
34
>>> getDistance("Youngstown OH", "Youngstown OH", data)
0
>>> getDistance("Youngstown OH", "Yankton SD", data)
966
>>> getCoordinates("Wisconsin Dells WI", data)
[4363, 8977]
>>> getPopulation("Wisconsin Dells WI", data)
2521
>>> getCoordinates("Ravenna OH", data)
[4116, 8124]
>>> getPopulation("Ravenna OH", data)
11987
>>> nearbyCities("Youngstown OH", 100.0, data)
['Ravenna OH', 'Steubenville OH', 'Wheeling WV', 'Youngstown OH']
>>> getDistance("Youngstown OH",'Ravenna OH', data)
34
>>> getDistance("Youngstown OH",'Steubenville OH', data)
60
>>> getDistance("Youngstown OH",'Wheeling WV', data)
85
>>> nearbyCities("Waterloo IA", 200.0, data)
['Rochester MN', 'Rockford IL', 'Saint Paul MN', 'Waterloo IA']
>>> nearbyCities("San Francisco CA", 100.0, data)
['Sacramento CA', 'San Francisco CA', 'San Jose CA', 'Santa Rosa CA', 'Stockton CA']
>>> nearbyCities("Waco TX", 200, data)
['San Antonio TX', 'Sherman TX', 'Tyler TX', 'Waco TX']
>>> len(nearbyCities("Waco TX",20000, data)) 
128
>>> len(nearbyCities("Winston-Salem NC", 0, data)) 
1
>>> "Waterloo IA" in nearbyCities("Waterbury CT", 1190, data)
True
>>> "Walla Walla WA" in nearbyCities("Waterbury CT", 1190, data)
False
>>> getDistance("Valdosta GA", "Valley City ND", data)
1648
>>> [getPopulation(x, data) for x in nearbyCities("Utica NY", 100, data)]
[67972, 170105, 75632, 27861]
>>> sum([getPopulation(x, data) for x in nearbyCities("Salisbury MD", 20000, data)])
15344591
>>> sum([getPopulation(x, data) for x in nearbyCities("Waco TX", 20000, data)])
15344591
>>> nearbyCities("Saint Johnsbury VT", 150, data)
['Rutland VT', 'Saint Johnsbury VT']
>>> [len(nearbyCities(x, 50, data))-1 for x in nearbyCities("Rhinelander WI", 20000, data)].count(0)
110
>>> getCoordinates("Utica NY", data)[0] > getCoordinates("Waco TX", data)[0]
True
>>> getDistance("Tampa FL", "Tallahassee FL", data)
245
>>> [x for x in nearbyCities("Salina KS", 20000, data) if "BC" in x]
['Vancouver BC']
>>> [x for x in nearbyCities("Salina KS", 20000, data) if x.startswith("San")]
['San Angelo TX', 'San Antonio TX', 'San Bernardino CA', 'San Diego CA', 'San Francisco CA', 'San Jose CA', 'Sandusky OH', 'Santa Ana CA', 'Santa Barbara CA', 'Santa Fe NM', 'Santa Rosa CA']
>>> [x for x in nearbyCities("Salina KS", 20000, data) if "IA" in x]
['Sioux City IA', 'Waterloo IA']
'''
#-------------------------------------------------------
from project1Phase1 import *
#-------------------------------------------------------
if __name__ == "__main__":
    import doctest
    doctest.testmod()
