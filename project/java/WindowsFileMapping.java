package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A windows file mapping is the association of a file's contents with a portion of the virtual address space of a process within a Windows operating system. The system creates a file mapping object (also known as a section object) to maintain this association. A file view is the portion of virtual address space that a process uses to access the file's contents. file mapping allows the process to use both random input and output (I/O) and sequential I/O. It also allows the process to work efficiently with a large data file, such as a database, without having to map the whole file into memory. Multiple processes can also use memory-mapped files to share data. processes read from and write to the file view using pointers, just as they would with dynamically allocated memory. The use of file mapping improves efficiency because the file resides on disk, but the file view resides in memory.[based on https://docs.microsoft.com/en-us/windows/win32/memory/file-mapping]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsFileMapping extends ObservableObject {


}