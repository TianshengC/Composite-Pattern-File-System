# Composite Pattern File System
 
This system embodies a streamlined file management structure, leveraging the composite design pattern. At its core, the system comprises files and directories. Each directory can encapsulate other directories and/or files, all nested within a singular top-level directory. The system offers the following functionalities:

Add: Users can append a file or directory to a specified directory using the add(Component) method.

Delete: Users can expunge a file or directory from the immediate children of a specified directory via the remove(Component) method.

Display: The system can display a directory along with its entire contents, detailing the name and size of each constituent, be it a file or another directory.

Size Retrieval: Users can ascertain the size of a directory, which is computed as the cumulative size of the files it houses.

Search: The system facilitates the search for a directory housing a file with a specific name. It's imperative to note that the search is case-sensitive and matches the file name precisely. In scenarios where multiple directories contain the file, only the first encountered directory is returned. The search functionality is exclusive to file names and does not extend to directory names.

Display Example:

root: (count=6, size=887)
+-Settings (10)
+-music: (count=1, size=120)
+-+-rubgtone (120)
+-pictures: (count=4, size=757)
+-+-personal: (count=2, size=335)
+-+-+-family (201)
+-+-+-portrait (134)
+-+-misc: (count=2, size=422)
+-+-+-wallpaper (421)
+-+-+-family (1)

"+-" for presenting indentation only.

