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
                <room>00</room>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
                        <caseno>${caseNo}</caseno>
                        <type>C</type>
                        <def_name>MR ${firstName} ${surname}</def_name>
                        <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>
                        <def_type>P</def_type>
                        <def_sex>M</def_sex>
                        <def_name_elements>
                          <title>Mr</title>
                          <forename1>${firstName}</forename1>
                          <forename2/>
                          <forename3/>
                          <surname>${surname}</surname>
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
