船只资料管理信息系统
=
一、业务描述 
--
###### 根据公司对船只的管理该管理系统的建设主要包括： 
>1、对船只的基本资料的统一管理：如船只的所有者的基本资料、船舶类型、机型等基本资料的管理； 
2、分别对船只相应的证书：营运证书的基本资料、检验证书的基本资料、安检证书的基本资料、国籍配员证书的基本资料等进行管理；
3、分别对船只相应的费用：船只航道费的缴纳情况、船只水运费的缴纳情况等进行管理； 
4、查询打印船只的相关资料：根据公司对船只的管理业务，查询符合管理人员所设定的查询要求的船只的相关资料，方便管理人员对查询出来的资料的修改或打印； 
5、证书到期信息提示：根据船只相关的证书的有效日期，管理人员可设置系统提示并通知管理人员相关证书即将到期的所有的船只的信息，方便管理人员安排时间和人员处理办证业务。 
6、系统还可以具备有效的统计分析、查询、分类等要求；系统完成后能打印相关文档，以方便管理人员对相关业务和资料的纸质备份；能产生一定的报表，打印报表等要求。

二、系统必须具备的功能
--
>* __（一）、登录信息管理模块：__
1. 用户登录：启动客户端程序时，显示用户登录对话框。登录用户可以输入用户编号或用户名后，系统反馈该登录用户的工作编号、姓名和用户身份（与权限相关），根据用户输入的密码，需要有收费权的用户选择与之合作的收款人后，按回车或选择登陆便可进入收费管理系统。 另外，与用户登录相关的功能还有：“退出系统”、“重新登陆”、“修改用户密码”、“用户消息提示”。
2. 退出系统：正常关闭客户端程序。
3. 重新登录：即注销当前登录用户，同时在更改登录用户。使用该功能时，系统关闭所有窗体，并重新出现登录窗体。此时，系统根据新登录的用户信息更改应用程序服务器端中对应该信息点的使用用户的信息，记录该信息点的使用情况。 
4. 修改密码：用户输入旧密码与两次新密码便可对登陆用户本身的密码进行修改。系统对用户的密码进行加密后存入数据库，保证用户密码不被窃取。 
5. 配置服务器信息：当服务器IP地址变动或因其他情况无法找到服务器的时候，方便技术人员进行配置。 

>* __（二）、系统管理模块：__ 
1. 用户管理：可以增加、删除用户。对用户权限进行赋予、修改。重新设置用户的密码。
2. 用户权限管理：根据工作的需要（如调整工作岗位、调整工作职责等），动态设置相应用户的权限（如收费权、监督权等），使得每个用户根据工作职责，负责对应的工作。 
3. 用户操作查询：由于应用服务器记录了每一个用户的登录、离开与重要操作。管理员能够根据日期或用户名查询操作记录。 

>* __（三）、资料查询与报表处理模块：__
1.  根据用户的查询要求，可以设置按以下方式进行查询：
按船只名称查询对应的各类证书：营运证书、检验证书、安检证书、国籍配员证书的基本信息； ?	按船只的名称查询该船只的缴费情况（船只的缴纳时间单位是以月为单位的）：缴纳航道费、缴纳水运费的情况；缴纳费用的历史情况； ?	按时间段或某一指定时间中，相关证书的有效日期和办证通知的时间等； ?	按船只名称查找船只的所有关联资料。 
2.  将用户通过查询数据库所得到的船只信息、证书到期信息等以报表的形式进行打印，方便管理人员通知相关人员处理办证手续和通知船只所有人进行办理缴纳相关费用。

>* __（四）、船只基本资料管理模块：__ 
1. 录入新增加的船只的基本资料到船只资料表中：包括船主的基本资料（船主姓名、身份证、联系电话、详细住址）；船只基本资料（船只名称、船舶类型、船体材料、机型、船籍港、建造厂、船舶登记号、营运证号、入户时间、迁出时间、建成时间、总长、型宽、型深、总吨、净吨、主机功率、载重吨（AB级）、航行区域、备注、船舶相片）； 
2. 可以按船只名称、船检登记号、船舶类型、船舶营运证号等进行查询相关船只的基本资料，并可以打印船只的基本资料；
3. 修改船只的基本资料并保存入数据库中；
4. 从数据库中删除已经不接受管理的船只的基本资料；

>* __（五）、船只营运证书资料管理模块:__
1. 录入新增加的船只的营运证书的基本信息到数据库中并关联起船只名称和船检登记号：
包括营运证编号、船舶所有人、船舶登记号、经营人许可证号码、管理人许可证号码、发证机关、营运证使用有效期至、发证日期;
2. 设置船只营运证到期提示（警报）： 
公司管理人员根据船只的营运证到期日期可设置在某一时间段内让系统提示管理人员处理营运证即将到期的船只，为该船只办理相关手续，防止手工查寻资料不全和不及时而导致延误了办理相关的手续；
3.  可以按船只名称、船检登记号、船舶类型、船舶营运证号等进行查询相关的营运证书的基本信息；
4.  修改船只营运证书的基本信息（修改营运证到期时间等）并保存入数据库中； 
5.  从数据库中删除已经不接受管理的船只的营运证信息；

>* __（六）、船只检验证书资料管理模块：__ ?
1. 录入新增加的船只的检验证书的基本信息到数据库中并关联起船只名称和船检登记号：包括检验证编号、船舶所有人、船舶登记号、船舶检验类型、下次检验时间、通知时间、检验机关、检验证使用有效期至、发证日期、船只检验情况记录； 
2. 	设置船只检验证到期提示（警报）：公司管理人员根据船只的检验证到期日期可设置在某一时间段内让系统提示管理人员处理检验证即将到期的船只，为该船只办理相关手续或通知船只到相关机构进行检验，防止手工查寻资料不全和不及时而导致延误了办理相关的手续；
3.	可以按船只名称、船检登记号、船舶检验证编号、下次检验时间、通知检验时间等进行查询相关的检验证书的基本信息； ?
4. 修改船只检验证书的基本信息（修改检验证到期时间等）并保存入数据库中； ?
5. 从数据库中删除已经不接受管理的船只的检验证信息； 
>* __（七）、船只安检证书资料管理模块：__
1. 	录入新增加的船只的安检证书的基本信息到数据库中并关联起船只名称和船检登记号：包括安检证书编号、船舶所有人、船舶登记号、检查机关、下次检查时间、通知时间、安检证书使用有效期至、发证日期、船只检验情况记录； 
2. 设置船只安检证书到期提示（警报）：公司管理人员根据船只的安检证书到期日期可设置在某一时间段内让系统提示管理人员处理安检证书即将到期的船只，为该船只办理相关手续或通知船只到相关机构进行检查，防止手工查寻资料不全和不及时而导致延误了办理相关的手续； ?
3. 可以按船只名称、船检登记号、船舶安检证书编号、通知检查时间、下次检查时间等进行查询相关的安检证书的基本信息； 
4. 修改船只安检证书的基本信息（修改检验证到期时间等）并保存入数据库中； 
5. 从数据库中删除已经不接受管理的船只的安检证书信息； 
>* __（八）、船只国籍配员证书资料管理模块：__
1. 录入新增加的船只的国籍配员证书的基本信息到数据库中并关联起船只名称和船检登记号：包括国籍配员证书编号、船舶所有人、船舶登记号、下次换证时间、换证通知时间、国籍配员证书使用有效期至、发证日期、国籍配员证书换证时间记录； 
2. 设置船只国籍配员证书到期提示（警报）：公司管理人员根据船只的国籍配员证书到期日期可设置在某一时间段内让系统提示管理人员处理国籍配员证书即将到期的船只，为该船只办理相关手续或通知船主到相关机构换证，防止手工查寻资料不全和不及时而导致延误了办理相关的手续； 
3. 可以按船只名称、船检登记号、船舶国籍配员证书编号、换证通知时间、下次换证时间等进行查询相关的国籍配员证书的基本信息； 
4. 修改船只国籍配员证书的基本信息（修改检验证到期时间等）并保存入数据库中； 
5. 从数据库中删除已经不接受管理的船只的国籍配员证书信息；
>* __（九）、船只缴纳航道费情况管理模块：__
1. 录入船只按月缴纳航道费的基本情况到数据库中并关联起船只名称和船检登记号：包括船名、航道费（元/月）、填表日期、航道费合计、航道费缴纳的记录（本年度每个月缴纳的情况）；
2. 记录收款人上交航道局的签注记录； 	按船名、本年度的各个月份、填表时间等查询相关船只缴纳航道费的记录，并可以打印查询出来的结果；
3. 	修改船只缴纳航道费的基本情况； 
4.  删除无效船只缴纳航道费的记录；
>* __（十）、船只缴纳水运费情况管理模块：__
 1. 录入船只按月缴纳水运费的基本情况到数据库中并关联起船只名称和船检登记号：包括船名、航道费（元/月）、填表日期、水运费合计、水运费缴纳的记录（本年度每个月缴纳的情况）； 
 2. 记录收款人上交交通局的签注记录；
 3. 按船名、本年度的各个月份、填表时间等查询相关船只缴纳水运费的记录，并可以打印查询出来的结果； 
 4. 修改船只缴纳水运费的基本情况； 
 5. 删除无效船只缴纳水运费的记录；