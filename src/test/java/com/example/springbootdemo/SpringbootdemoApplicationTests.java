package com.example.springbootdemo;

//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SpringbootdemoApplicationTests {
//
//    private MockMvc mockMvc;
//    @Value("${book.name}")
//    private String name;
//    @Before
//    public void setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup(new TestController()).build();
//    }
//
//    @Test
//    public void contextLoads() {
//        try {
//            System.out.println("-------------------" + name);
//            String resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/test").accept(MediaType.APPLICATION_JSON))
//                    .andReturn().getResponse().getContentAsString();
//            System.out.println(resultActions);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
