# X3Map
This map is a little project that I did to help developpers who might need this.
<br>
You have a **key** and a **index** for each set of values.
<br>
You then have two value:
<br><li>
The **default value** which is necessary
<br><li>
The **extended value** which is optional
<br><br>
<details><summary>How the functions() work:</summary>
<details><summary>The set function</summary>
<p>
<br>
To set the values the program will ask you for the <b>key</b>, the <b>defaultValue</b> and the <b>extendedValue</b>
<br><br>
It will then add them to their respective ArrayLists.
</p>
</details>

<details><summary>The get function</summary>
<p>
<br>
To get the values the program asks you for the <b>key</b> or the <b>index</b>:
<li>
If you give it the <b>key</b> it will look in the key's ArrayList and search for its <b>index</b>.
<br><li>
If you give it the <b>index</b> it will go to the next step automaticly.
<br><br>
With the <b>index</b> it will go through the two ArrayLists of the <b>values</b> and find the <b>values</b> located in said <b>index</b>.
</p>
</details>
<details><summary>The rem function</summary>
<p>
<br>
To remove a <b>set</b> from the <b>map</b>.
<br><br>
It will use the ArrayList function .remove() on each ArrayLists.
</p>
</details>
<details><summary>The mov function</summary>
<p>
<br>
To move the <b>set</b> to another <b>index</b>.
<br><br>
It will add the <b>set</b> to another <b>index</b> and delete the <b>set</b> in the old one.
</p>
</details>
<details><summary>The ind function</summary>
<p>
<br>
To retrieve the <b>index</b> of a <b>set</b>.
<br><br>
It will use the ArrayList function .indexOf() to get the <b>index</b> of said <b>set</b>.
</p>
</details>
<details><summary>The cls function</summary>
<p>
<br>
To clear the <b>map</b>.
<br><br>
It sets all ArrayLists to null.
</p>
</details>


</details>
