package config

object XMLMessageString
{
  def cmpgHeader = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\"\n               xmlns:ns35=\"http://www.justice.gov.uk/magistrates/external/ExternalDocumentRequest\">\n    <soap:Header xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">\n        <wsa:Action>externalDocument</wsa:Action>\n        <wsa:From>\n            <wsa:Address>CP_NPS_ML</wsa:Address>\n        </wsa:From>\n        <wsa:MessageID>09233523-345b-4351-b623-5dsf35sgs5d6</wsa:MessageID>\n        <wsa:RelatesTo>RelatesToValue</wsa:RelatesTo>\n        <wsa:To>CP_NPS</wsa:To>\n    </soap:Header>\n    <soap:Body>\n        <ns35:ExternalDocumentRequest>\n"

  def cmpgBody = "<documents>\n            <document>\n                <info>\n                    <general>\n                        <doc_type>EDT_Adult_Daily_Courtlist</doc_type>\n                        <outputtype>R</outputtype>\n                        <version>1_0</version>\n                        <docref>575</docref>\n                        <system>L</system>\n                    </general>\n                    <source_file_name>5_26102020_2992_${court_code}00_ADULT_COURT_LIST_DAILY</source_file_name>\n                    <printers/>\n                    <parameters>\n                        <pi_mcc_id>7</pi_mcc_id>\n                        <pi_psa_code>2360</pi_psa_code>\n                        <pi_job_type>ADULT_COURT_LIST_DAILY</pi_job_type>\n                        <pi_run_date>26/11/2020</pi_run_date>\n                        <pi_edt_user>2368</pi_edt_user>\n                    </parameters>\n                    <start_time>09:05:04</start_time>\n                </info>\n                <data>\n                    <job>\n                        <printdate>${local_nowDate}</printdate>\n                        <username>gl.userone</username>\n                        <late>N</late>\n                        <adbox>N</adbox>\n                        <means>N</means>\n                        <sessions>\n                            <session>\n                                <s_id>556805</s_id>\n                                <doh>${local_nowDate}</doh>\n                                <lja>${court_name}; Court</lja>\n                                <cmu>Gl Management Unit 1</cmu>\n                                <panel>Adult Panel</panel>\n                                <court>${court_name}</court>\n                                <room>00</room>\n                                <sstart>09:00</sstart>\n                                <send>12:00</send>\n                                <blocks>\n                                    <block>\n                                        <sb_id>758095</sb_id>\n                                        <bstart>09:00</bstart>\n                                        <bend>12:00</bend>\n                                        <desc>First Hearings Slot</desc>\n                                        <cases>\n                                            <case>\n                                                <c_id>1218461</c_id>\n                                                <h_id>1294273</h_id>\n                                                <valid>Y</valid>\n                                                <!-- Less than 10 digits would fail schema validation, if we did it -->\n                                                <caseno>166662981</caseno>\n                                                <type>C</type>\n                                                <def_name>MR ${firstName} ${surname}</def_name>\n                                                <def_dob>${dobDay}/${dobMonth}/${dobYear}</def_dob>\n                                                <def_type>P</def_type>\n                                                <def_sex>M</def_sex>\n                                                <def_name_elements>\n                                                    <title>Mr</title>\n                                                    <forename1>${firstName}</forename1>\n                                                    <forename2/>\n                                                    <forename3/>\n                                                    <surname>${surname}</surname>\n                                                </def_name_elements>\n                                                <pnc_id>2020/1276541A</pnc_id>\n                                                <cro_number>CR0006100061</cro_number>\n                                                <def_addr>\n                                                    <line1>A1</line1>\n                                                </def_addr>\n                                                <inf>POL01</inf>\n                                                <cseq>2</cseq>\n                                                <listno>1st</listno>\n                                                <offences>\n                                                    <offence>\n                                                        <oseq>1</oseq>\n                                                        <co_id>1185408</co_id>\n                                                        <code>TH68010</code>\n                                                        <maxpen>EW: 6M ;/or Ultd Fine</maxpen>\n                                                        <title>Theft from a shop</title>\n                                                        <sum>On 01/01/2016 at Town, stole Article, to the value of £100.00, belonging to Person.</sum>\n                                                        <as>Contrary to section 1(1) and 7 of the Theft Act 1968.</as>\n                                                    </offence>\n                                                </offences>\n                                            </case>\n                                        </cases>\n                                    </block>\n                                </blocks>\n                            </session>\n                        </sessions>\n                    </job>\n                </data>\n            </document>\n        </documents>\n"

  def cmpgFooter = "</ns35:ExternalDocumentRequest>\n        </soap:Body>\n        </soap:Envelope>"

}
