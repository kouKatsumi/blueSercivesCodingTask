# blueSercivesCodingTask
Assumptions:
- No filtering (missing functionality)
- Using protoc to generate protobuf file (*.bat file for generation under windows system included)
- No autentication or authorization checking
- Document list keeped in memory
- No hihstory of document edition (only state changes)
- State changes history in server local time
- No text validation
- Document incremental ID in long


Possible improvments:
- Creating own type for Exception when trying to change ending state (Published, Rejected, Deleted)
or making cilcular change in ending state
- Better state/action mapping: enum/interfaces/etc
- Less hardcoded values
- Ading a database
- Content version checking while editing document content
- User friendly UI