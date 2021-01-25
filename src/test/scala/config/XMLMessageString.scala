package config

object XMLMessageString
{
  def cmpgHeader = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\"\n               xmlns:ns35=\"http://www.justice.gov.uk/magistrates/external/ExternalDocumentRequest\">\n    <soap:Header xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">\n        <wsa:Action>externalDocument</wsa:Action>\n        <wsa:From>\n            <wsa:Address>CP_NPS_ML</wsa:Address>\n        </wsa:From>\n        <wsa:MessageID>09233523-345b-4351-b623-5dsf35sgs5d6</wsa:MessageID>\n        <wsa:RelatesTo>RelatesToValue</wsa:RelatesTo>\n        <wsa:To>CP_NPS</wsa:To>\n    </soap:Header>\n    <soap:Body>\n        <ns35:ExternalDocumentRequest>\n"

  def cmpgBody = {
    """<documents>
      <document>
        <info>
          <general>
            <doc_type>EDT_Adult_Daily_Courtlist</doc_type>
            <outputtype>R</outputtype>
            <version>1_0</version>
            <docref>575</docref>
            <system>L</system>
          </general>
          <source_file_name>5_26102020_2992_${court_code}00_ADULT_COURT_LIST_DAILY</source_file_name>
          <printers/>
          <parameters>
            <pi_mcc_id>7</pi_mcc_id>
            <pi_psa_code>2360</pi_psa_code>
            <pi_job_type>ADULT_COURT_LIST_DAILY</pi_job_type>
            <pi_run_date>26/11/2020</pi_run_date>
            <pi_edt_user>2368</pi_edt_user>
          </parameters>
          <start_time>09:05:04</start_time>
        </info>
        <data>
          <job>
            <printdate>${local_nowDate}</printdate>
            <username>gl.userone</username>
            <late>N</late>
            <adbox>N</adbox>
            <means>N</means>
            <sessions>
              <session>
                <s_id>556805</s_id>
                <doh>${local_nowDate}</doh>
                <lja>${court_name}; Court</lja>
                <cmu>Gl Management Unit 1</cmu>
                <panel>Adult Panel</panel>
                <court>${court_name}</court>
                <room>0${courtRoomNumber}</room>
                <sstart>09:00</sstart>
                <send>12:00</send>
                <blocks>
                  <block>
                    <sb_id>758095</sb_id>
                    <bstart>09:00</bstart>
                    <bend>12:00</bend>
                    <desc>First Hearings Slot</desc>
                    <cases>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo1}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName1} ${Matched_Surname1}</def_name>
                        <def_dob>${Matched_dobDay1}/${Matched_dobMonth1}/${Matched_dobYear1}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName1}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname1}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC1}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo2}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName2} ${Matched_Surname2}</def_name>
                        <def_dob>${Matched_dobDay2}/${Matched_dobMonth2}/${Matched_dobYear2}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName2}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname2}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC2}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo3}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName3} ${Matched_Surname3}</def_name>
                        <def_dob>${Matched_dobDay3}/${Matched_dobMonth3}/${Matched_dobYear3}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName3}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname3}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC3}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo4}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName4} ${Matched_Surname4}</def_name>
                        <def_dob>${Matched_dobDay4}/${Matched_dobMonth4}/${Matched_dobYear4}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName4}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname4}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC4}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo5}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName5} ${Matched_Surname5}</def_name>
                        <def_dob>${Matched_dobDay5}/${Matched_dobMonth5}/${Matched_dobYear5}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName5}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname5}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC5}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo6}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName6} ${Matched_Surname6}</def_name>
                        <def_dob>${Matched_dobDay6}/${Matched_dobMonth6}/${Matched_dobYear6}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName6}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname6}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC6}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo7}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName7} ${Matched_Surname7}</def_name>
                        <def_dob>${Matched_dobDay7}/${Matched_dobMonth7}/${Matched_dobYear7}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName7}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname7}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC7}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo8}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName8} ${Matched_Surname8}</def_name>
                        <def_dob>${Matched_dobDay8}/${Matched_dobMonth8}/${Matched_dobYear8}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName8}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname8}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC8}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo9}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName9} ${Matched_Surname9}</def_name>
                        <def_dob>${Matched_dobDay9}/${Matched_dobMonth9}/${Matched_dobYear9}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName9}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname9}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC9}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo10}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName10} ${Matched_Surname10}</def_name>
                        <def_dob>${Matched_dobDay10}/${Matched_dobMonth10}/${Matched_dobYear10}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName10}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname10}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC10}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo11}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName11} ${Matched_Surname11}</def_name>
                        <def_dob>${Matched_dobDay11}/${Matched_dobMonth11}/${Matched_dobYear11}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName11}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname11}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC11}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo12}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName12} ${Matched_Surname12}</def_name>
                        <def_dob>${Matched_dobDay12}/${Matched_dobMonth12}/${Matched_dobYear12}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName12}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname12}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC12}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo13}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName13} ${Matched_Surname13}</def_name>
                        <def_dob>${Matched_dobDay13}/${Matched_dobMonth13}/${Matched_dobYear13}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName13}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname13}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC13}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo14}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName14} ${Matched_Surname14}</def_name>
                        <def_dob>${Matched_dobDay14}/${Matched_dobMonth14}/${Matched_dobYear14}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName14}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname14}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC14}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo15}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName15} ${Matched_Surname15}</def_name>
                        <def_dob>${Matched_dobDay15}/${Matched_dobMonth15}/${Matched_dobYear15}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName15}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname15}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC15}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo16}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName16} ${Matched_Surname16}</def_name>
                        <def_dob>${Matched_dobDay16}/${Matched_dobMonth16}/${Matched_dobYear16}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName16}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname16}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC16}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo17}</caseno>
                        <type>C</type>
                        <def_name>MR ${Matched_FirstName17} ${Matched_Surname17}</def_name>
                        <def_dob>${Matched_dobDay17}/${Matched_dobMonth17}/${Matched_dobYear17}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Matched_FirstName17}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Matched_Surname17}</surname>
                        </def_name_elements>
                        <pnc_id>${Matched_PNC17}</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo18}</caseno>
                        <type>C</type>
                        <def_name>MR ${Random_firstName18} ${Random_surname18}</def_name>
                        <def_dob>${Random_dobDay18}/${Random_dobMonth5}/${Random_dobYear18}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Random_firstName18}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Random_surname18}</surname>
                        </def_name_elements>
                        <pnc_id>2020/1276541A</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo19}</caseno>
                        <type>C</type>
                        <def_name>MR ${Random_firstName19} ${Random_surname19}</def_name>
                        <def_dob>${Random_dobDay19}/${Random_dobMonth4}/${Random_dobYear19}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Random_firstName19}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Random_surname19}</surname>
                        </def_name_elements>
                        <pnc_id>2020/1276541A</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo20}</caseno>
                        <type>C</type>
                        <def_name>MR ${Random_firstName20} ${Random_surname20}</def_name>
                        <def_dob>${Random_dobDay20}/${Random_dobMonth3}/${Random_dobYear20}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Random_firstName20}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Random_surname20}</surname>
                        </def_name_elements>
                        <pnc_id>2020/1276541A</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo21}</caseno>
                        <type>C</type>
                        <def_name>MR ${Random_firstName21} ${Random_surname21}</def_name>
                        <def_dob>${Random_dobDay21}/${Random_dobMonth2}/${Random_dobYear21}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Random_firstName21}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Random_surname21}</surname>
                        </def_name_elements>
                        <pnc_id>2020/1276541A</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                      <case>
                        <c_id>1218461</c_id>
                        <h_id>1294273</h_id>
                        <valid>Y</valid>
                        <!-- Less than 10 digits would fail schema validation, if we did it -->
                        <caseno>${caseNo22}</caseno>
                        <type>C</type>
                        <def_name>MR ${Random_firstName22} ${Random_surname22}</def_name>
                        <def_dob>${Random_dobDay22}/${Random_dobMonth1}/${Random_dobYear22}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${Random_firstName22}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${Random_surname22}</surname>
                        </def_name_elements>
                        <pnc_id>2020/1276541A</pnc_id>
                        <cro_number>CR0006100061</cro_number>
                        <def_addr>
                          <line1>A1</line1>
                        </def_addr>
                        <inf>POL01</inf>
                        <cseq>2</cseq>
                        <listno>1st</listno>
                        <offences>
                          <offence>
                            <oseq>1</oseq>
                            <co_id>1185408</co_id>
                            <code>TH68010</code>
                            <maxpen>EW: 6M ;/or Ultd Fine</maxpen>
                            <title>Theft from a shop</title>
                            <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>
                            <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>
                          </offence>
                        </offences>
                      </case>
                    </cases>
                  </block>
                </blocks>
              </session>
            </sessions>
          </job>
        </data>
      </document>
    </documents>
  """
  }

  def cmpgFooter = "</ns35:ExternalDocumentRequest>\n        </soap:Body>\n        </soap:Envelope>"

}
